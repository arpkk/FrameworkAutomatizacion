pipeline {
  agent any
  tools{gradle "gr"}
  environment {
    TEXTISSUE = "${params.TextIssue}"
  }
  node {
    withGradle {
      sh "gradle runWithCucumber -P tags='@google'"
    }
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
