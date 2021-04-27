pipeline {
	agent any
	stages {
		stage ('One') {
			steps {
				echo 'Hello, this is a pipeline demo'
				}
			}
		stage ('Two') {
			steps {
				input ('Do u want to continue')
				}
			}
		stage ('Three') {
			when {
				not {
					branch "master"
					}
				}
			steps {
				echo 'Hello'
				}
			}
		stage ('Four') {
			steps{
					echo "Running unit test"
				}
			
					}
			
			}
		}
	}
	