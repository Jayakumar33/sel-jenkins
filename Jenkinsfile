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
    enviroment{
    PATH = "\Drivers\apache-maven-3.8.6\bin:$PATH"
       }
    
    stages {
        stage('Demo for chrome') {
            steps {
                echo 'chrome'
               sh "mvn -Dtest=Demo test"
            }
        }
        stage('Demo for firefox') {
            steps {
                echo ' firefox'
             sh"mvn -Dtest=Demo test  "   
            }
        }
        stage('Demo for edge') {
            steps {
                echo 'edge'
               sh "mvn -Dtest=Demo test"
            }
        }
    }
}

