
pipeline {
    agent any

    environment {
        jobCredentialsId = 'admin'
        iqStage = 'build'
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -Dproject.version=$BUILD_VERSION -Dmaven.test.failure.ignore clean install clm:evaluate'
            }
        }

        // stage('Nexus IQ Scan'){
        //     steps {
        //         script{
        //                 nexusPolicyEvaluation failBuildOnNetworkError: true, 
        //                                       iqApplication: selectedApplication('consumer-ci'), 
        //                                       iqScanPatterns: [[scanPattern: '**/*.war']], 
        //                                       iqStage: "${iqStage}", 
        //                                       jobCredentialsId: "${jobCredentialsId}"
        //         }
        //     }
        // }
    }
}

