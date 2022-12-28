pipeline {
  agent any
  environment {
    TEXTISSUE = "${params.TextIssue}"
  }
  withGradle {
    sh "gradle runWithCucumber -P tags='@google'"
  }
  stages {
    stage('Build') {
      steps {
        echo "hace algo"
        echo "$TEXTISSUE"
      }
    }
  }
}
