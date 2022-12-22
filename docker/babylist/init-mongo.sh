mongosh <<EOF

    var dbToInit = '$MONGO_INITDB_DATABASE';
    use dbToInit;

    var rootUser = '$MONGO_INITDB_ROOT_USERNAME';
    var rootPassword = '$MONGO_INITDB_ROOT_PASSWORD';
    var admin = db.getSiblingDB('admin');
    admin.auth(rootUser, rootPassword);

    var user = '$MONGO_INITDB_USERNAME';
    var passwd = 'MONGO_INITDB_PASSWORD';
    admin.createUser({user: user, pwd: passwd, roles: ["readWrite"], db: "$MONGO_INITDB_DATABASE"});
EOF