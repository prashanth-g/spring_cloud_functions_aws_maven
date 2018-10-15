Using serveless deployment.
    
    $ mvn clean package

    $ sls deploy -v

    $ sls invoke -f uppercase -l --aws-profile default --data "test-data"

Note: Invoke may sometime. Increase timeout in your Lambda -> Basic Settings