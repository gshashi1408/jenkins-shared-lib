
def java(){
    echo "Building java project"
    sh '''
      mvn clean package
    '''
}
