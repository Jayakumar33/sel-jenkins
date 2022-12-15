// pipeline {
//     agent any
//    stages {
//   stage('build') {
//     steps {
//       echo "Build success".
//     }
//   }

//   stage('test') {
//     steps {
//         echo "test success".
//     }
//   }

//   stage('deploy') {
//     steps {
//         echo "deploy success".
//     }
//   }

// }
// }


//  pipeline
pipeline {
    agent any
   
    
    stages {
        stage('Demo for chrome') {
            steps {
                echo 'chrome'
                bat "mvn -Dtest=Demo test"
            }
        }
        stage('Demo for firefox') {
            steps {
                echo ' firefox'
                bat"mvn -Dtest=Demo test  "   
            }
        }
        stage('Demo for edge') {
            steps {
                echo 'edge'
                bat "mvn -Dtest=Demo test"
            }
        }
    }
}

