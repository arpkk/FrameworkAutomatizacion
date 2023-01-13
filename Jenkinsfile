pipeline {
  agent any
  tools {
    gradle "gr7"
  }
  environment {
    TESTPLAN = "${params.TESTPLAN}"
  }
  stages {
    stage('Git'){
      steps{
        git branch: 'main', url: 'https://github.com/arpkk/FrameworkAutomatizacion.git'
      } 
    }
    stage('Build') {
      steps {
        sh "gradle --version"
        sh "java --version"
        echo "$TESTPLAN"
        sh 'gradle clean runWithCucumber -P tags=\\"@TEST_XRAY-13\\"'
      }
    }
    stage('Jira'){
      steps {
        sh "chmod +x -R ${env.WORKSPACE}"
        sh " IR=$TESTPLAN ./Attachment.sh IR "
      }
    }
    stage('Xray') {
      steps {
        echo "xray"
          sh '''
          token=$(curl -H "Content-Type: application/json" -X POST --data @"cloud_auth.json" https://xray.cloud.getxray.app/api/v2/authenticate| tr -d '"')
          curl -H "Content-Type: multipart/form-data" -X POST -F info=@issueFields.json -F results=@src/test/resources/output/report/Cucumber.json -H "Authorization: Bearer $token" https://xray.cloud.getxray.app/api/v2/import/execution/cucumber/multipart
          '''
      }
    }
    /*
    stage('CleanWorkspace'){
      steps {
        cleanWs()
      }
    }*/
  }
}
