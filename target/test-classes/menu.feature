@menu
Feature: Validar funcionalidades do menu elements
Como usuario da aplicacao
Quero entrar no site
Para validar as funcionalidades

Background: home page
Given que eu esteja na home page 

Scenario: validar checkbox do menu elements
When clicar menu elements
And clicar no submenu check box
Then sistema exibe uma lista de submenu