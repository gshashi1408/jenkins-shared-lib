
def call(String name = 'value'){
    echo "Building java project"
    sh '''
      mvn clean "${name}"
    '''
}
