pipeline{
    
    agent { label "prasad"}
    
    stages{
        
        stage("Code"){
            steps{
                echo "This is cloning the code"
                git url: "  your url"
                echo "Code Cloning is Done...!"
            }
        }
        stage("Build"){
            steps{
                echo "This is building the code"
                sh "docker build -t notes-app:latest ."
            }
        }
        stage("Test"){
            steps{
                echo "This is testing the code"
            }
        }
        stage("Deploy"){
            steps{
                echo "This is Deploying the code"
                sh "docker run -d -p 8000:8000 notes-app:latest"
            }
        }
    }
    
}
