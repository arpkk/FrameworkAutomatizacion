pipeline {
  agent any
  tools{ gradle "gr"}
  environment {
    TEXTISSUE = "${params.TextIssue}"
  }
  stages {
    stage('Build') {
      steps {
        echo "hace algo"
        echo "$TEXTISSUE"
        sh "gradle runWithCucumber -P tags=\"@google\""
      }
    }
  }
}
