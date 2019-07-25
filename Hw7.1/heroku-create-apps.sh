#!/usr/bin/env sh

heroku apps:create ElectronicGeekMarket
heroku addons:create heroku-postgresql:hobby-dev --app ElectronicGeekMarket
heroku config:set DB_DRIVER=org.postgresql.Driver HIBERNATE_DIALECT=org.hibernate.dialect.PostgreSQLDialect --app ElectronicGeekMarket
heroku config:set EUREKA_URI=https://ElectronicGeekMarket-eureka.herokuapp.com/eureka --app ElectronicGeekMarket
heroku config:set HOST_NAME=https://ElectronicGeekMarket.herokuapp.com --app ElectronicGeekMarket

heroku apps:create ElectronicGeekMarket-chatbot
heroku config:set BOT_NAME=chatbot --app ElectronicGeekMarket-chatbot
heroku config:set EUREKA_URI=https://geek-market-eureka.herokuapp.com/eureka --app ElectronicGeekMarket-chatbot
heroku config:set HOST_NAME=https://geek-market-chatbot.herokuapp.com --app ElectronicGeekMarkett-chatbot

heroku apps:create ElectronicGeekMarket-eureka