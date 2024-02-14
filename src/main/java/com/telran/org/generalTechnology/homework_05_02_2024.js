// В рамках БД "music" напишите след/запросы:

// Task # 1
// Вывести незаблокированных юзеров из Germany и USA

db.getCollection("users").find(
{country: {$in: ['Germany', 'USA']}, is_blocked: {$ne: true}}
)

// Task # 2
// Вывести названия треков продолжительностью от 5 до 15 мин

db.getCollection("tracks").find(
{duration_secs: {$gte: 5 * 60, $lte: 15 * 60}},
{title: 1, duration_secs: 1}
)

// Task # 3
// Разблокировать юзеров не из Germany

db.getCollection("users").updateMany(
{country: {$nin: ['Germany']}}, {$unset: {is_blocked: null}}
)

// Task # 4
// Увеличить баланс назаблокированных юзеров не из Germany на 150 EUR

db.getCollection("users").updateMany(
{country: {$nin: ['Germany']}, is_blocked: {$ne: true}}, {$inc: {balance: 150}}
)

// Task # 5
// Опишите схему БД "соц/сеть" (юзеры, публикации, друзья, чаты)

// Social/Network DB Schema
// 1. User Registration - insertOne()
// 2. Adding A Comment - insertOne()
// 3. Uploading The Pictures (for the first time in publication) - insertMany()
// 4. Editing Many Comments - updateMany()
// 5. Changing Data Profile Of An User - updateOne()
// 6. Searching For The Chats - find()
// 7. Searching For A Friend - findOne()
// 8. Calculating The Most Active Followers - countDocuments()
// 9. Removing Publication - deleteOne()
// 10. Deleting Pictures In Albums - deleteMany()