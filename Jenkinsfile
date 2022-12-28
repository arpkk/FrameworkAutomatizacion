pipeline {
  agent any
  tools{ gradle "Gradle 8.0-milestone-6"}
  environment {
    TEXTISSUE = "${params.TextIssue}"
  }
  stages {
    stage('Build') {
      steps {
        echo "hace algo"
        echo "$TEXTISSUE"
        sh 'gradle runWithCucumber -P tags="@google"'
      }
    }
  }
}
