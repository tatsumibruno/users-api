# users-api
Simple users API to be used in presentations

    It was not a concern to follow best practices

This project uses H2 (embedded), so just run inside IDE and it's ready to use

# Endpoints available

## POST
`/users`
Create a user
```bash
curl -X POST http://localhost:8080/users -H 'Content-Type:application/json' -d '{"name": "User 1", "email": "user1@gmail.com"}' | json_pp
curl -X POST http://localhost:8080/users -H 'Content-Type:application/json' -d '{"name": "User 2", "email": "user2@gmail.com"}' | json_pp
```

## GET
`/users`
List users
```bash
curl -X GET http://localhost:8080/users -H 'Content-Type:application/json' | json_pp
```

## DELETE
`/users/:id`
Disable a user
```bash
curl -X DELETE http://localhost:8080/users/1
```