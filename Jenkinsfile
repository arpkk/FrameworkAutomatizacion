pipeline {
  agent any
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
