# Object-Oriented Design Project
## Group Members 
David Chapman, Travis Crowe, Trent Holliday, Cameron Fisk, Derik Wuchte, Robert Howerton

IDEAS: //post ideas below

Main Project: Bank Application

From project specs: we need at least 4 patterns

OBSERVABLE PATTERN
This pattern will be very easy to implement for a bank/account system. ex
  Bank account balance is observable AND an observer
  it can observe activity from linked credit cards, pay-pal, debit cards, checks, direct deposit, automatic           withdrawals/transfers from other accounts. if the account is a mutual fund or some other stock-dependent account, it will also observe stock prices influencing the balance
  the owner of the account will be an observer and be updated every time the balance changes. the bank will also be an observer in cases where interest rate is adjusted based on stored amount, overdraft fee can be applied, balance drops below the minimum required for that particular account (e.g. $500)
  
====As for the other patterns, I believe there are 24 total. We only need (at least) 3 more of these.
a good source for OOD pattern info: http://en.wikipedia.org/wiki/Software_design_pattern
Try to look over the patterns and think about which ones will be both practical AND easy to implement in a bank application
