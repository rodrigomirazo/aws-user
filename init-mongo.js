db.createUser(
        {
            user: "root",
            pwd: "root",
            roles: [
                {
                    role: "readWrite",
                    db: "user"
                }
            ]
        }
);

db.user.insert({
    id: "1",
    firstName: "Rodrigo",
    lastName: "mv"
});

db.user.insert({
    id: "2",
    firstName: "Tania",
    lastName: "ro"
});
