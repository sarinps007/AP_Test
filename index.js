const axios=require('axios')
const express=require('express')
const cron = require("node-cron");

const app=express()
var date=new Date()


function check(){
    axios.get('https://api.publicapis.org/entries',{})
    .then((data)=>{
        console.log(data.data.entries[0])
        //console.log(prev,curr)
        //let end=new Date()
       // let start= end-5
        // data needs to be compared  if null error
    })
    .catch((error)=>{
        console.log(error)

    })
}

cron.schedule('*/5 * * * * *',check)

app.listen(3000)


1