db.createUser(
        {
            user: "usr1",
            pwd: "usr1",
            roles: [
                {
                    role: "readWrite",
                    db: "user"
                }
            ]
        }
);