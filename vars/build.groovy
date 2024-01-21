
def call(String name = 'value'){
    echo "Building, ${name} project"
    sh '''
      mvn clean package
    '''
}
