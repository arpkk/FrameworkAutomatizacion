pipeline {
  agent any
    tools {
    nodejs "nodejs"
  }
  environment {
    TEXTISSUE = "${params.TextIssue}"
  }
  stages {
    stage('Build') {
      steps {
        sh "gradle runWithCucumber -P tags='@google'"
        echo "hace algo"
        echo "$TEXTISSUE"
      }
    }
  }
}
