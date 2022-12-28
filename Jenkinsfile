node {
  withGradle {
    sh "gradle runWithCucumber -P tags='@google'"
  }
}

pipeline {
  agent any
  tools{gradle "gr"}
  environment {
    TEXTISSUE = "${params.TextIssue}"
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
