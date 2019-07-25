#!/usr/bin/env sh

heroku apps:destroy ElectronicGeekMarket --confirmElectronicGeekMarket
heroku apps:destroy ElectronicGeekMarket-chatbot --confirm ElectronicGeekMarket-chatbot
heroku apps:destroy ElectronicGeekMarket-eureka --confirm ElectronicGeekMarket-eureka