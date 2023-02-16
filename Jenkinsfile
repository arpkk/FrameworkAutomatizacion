pipeline {
  agent any
  tools {
    gradle "gr7"
  }
  environment {
    TESTPLAN = "${params.TESTPLAN}"
    TAG = "${params.TAG}"
  }
  stages {
    stage('CleanWorkspace') {
      steps {
        cleanWs()
      }
    }
    stage('Git') {
      steps {
        git branch: 'main', url: 'https://github.com/arpkk/FrameworkAutomatizacion.git'
      }
    }
    stage('Xvfb') {
      steps {
        sh 'Xvfb :99 -ac -screen 0 1280x1024x24 & export DISPLAY=$DISPLAY'
      }
    }
    stage('Build') {
      steps {
        sh "gradle --version"
        sh "java --version"
        echo "$TESTPLAN"
        echo "$TAG"
        sh "pwd"
        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE')
        {
            sh 'gradle runWithCucumber -P tags="@$TAG"'
        }
      }
    }
    stage('Jira') {
      steps {
        sh "chmod +x -R ${env.WORKSPACE}"
        sh "IR=$TESTPLAN ./Attachment.sh IR"
      }
    }
    stage('Xray') {
      steps {
        echo "xray"
        sh '''
          token=$(curl -H "Content-Type: application/json" -X POST --data @"cloud_auth.json" https://xray.cloud.getxray.app/api/v2/authenticate| tr -d '"')
          curl -H "Content-Type: multipart/form-data" -X POST -F info=@Info.json -F results=@src/test/resources/output/report/Cucumber.json -H "Authorization: Bearer $token" https://xray.cloud.getxray.app/api/v2/import/execution/cucumber/multipart
          '''
      }
    }
  }
}
