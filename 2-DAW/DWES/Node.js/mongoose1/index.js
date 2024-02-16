// models/contact.js
const mongoose = require('mongoose');

let contactSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true,
        minlength: 1,
        trim: true
    },
    phone: {
        type: String,
        required: true,
        unique: true,
        trim: true,
        match: /^\d{9}$/
    },
    age: {
        type: Number,
        min: 18,
        max: 120
    }
});

let Contact = mongoose.model('contacts', contactSchema);
module.exports = Contact;