Feature: Google Search
#Author: Sourabh
@test
Scenario Outline: Test to perform google search
Given User launches Google dot com
When User enters some <value as text> and click on search button
Then Google displays search results

Examples:

|value as text|
|sourabh|
