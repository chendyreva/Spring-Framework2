#!/usr/bin/env sh

heroku dyno:restart --app ElectronicGeekMarket-chatbot
heroku dyno:restart --app ElectronicGeekMarket
heroku dyno:restart --app ElectronicGeekMarket-eureka