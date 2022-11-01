/* You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following
constraints are satisfied:
The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z],
uppercase characters [A-Z] , and digits [0-9] .
The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z]
For example:
Username            	Validity
Julia                 INVALID; Username length < 8 characters
Samantha              VALID
Samantha_21           VALID
1Samantha             INVALID; Username begins with non-alphabetic character
Samantha?10_2A        INVALID; '?' character not allowed*/

Input Format :
The first line of input contains an integer n, describing the total number of usernames. Each of the next n lines contains a string describing the username.
The locked stub code reads the inputs and validates the username.

Constraints : 
1<=n<=100
The username consists of any printable characters.

Output Format :
For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Testcase1:
Input
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Output
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

Testcase2:
Input
100
wAtp5b6UnfJJUtQzGwKDZHP3_3wX4Z6XGhhDQnqZPdezHn0EVvWUTbILy7yLctj8F27HInSvJHdkCMQw
M3PrrYhLt840ehS8NVQpqIlW7OqK6re2AFT46fTJzR6@ztOuly
hXtVWgvV46dj8A2mD4w1T6GmiEd@xa1xfzmSoqe_H_cY
2w1ouNGTjEfmfI4yDytwZehY55zIRPusaMselqtRDbAMyLbS
adzy5uzuw2eUpUBK6LIGKT7h1n49tCYEX
RH0lHRqUaZu6ngU5
sQAIzanIFtSQSKVkYw5bZiR_WiAHRfkX@jxo52UNSVpMwMzit1eEoD3L2EUPwqRngk4x6WG5J2aDwBPD7VgglV9P@CceVEBL
dd4NMAlT869sevQzV4lkxrrPv8mCPbopx@KP@BNWijhJNRCcywhUpRO_X5u62XwfyikhVwvS7UU7E_kkJDAg4s0_wg1F9zwPh9
fB@swviN0PY3C9y_oOwrcuYjuDQO295m5ggW1yAQ5TV9UK6@myEj8lgw
L_PsNMemY23tm4Ff2DqMtC83WSaQ85soJntAxnxwo6KsEeSZh1kIzEtxdNpromJu_KSq2jYbaSzIQ1517dsD7ekl5k
gIGHoisTDPlOupRumC_cBNGOe55EpNGhjpe1DVNtuhsMBqHc934nnwJS_7e0OUE0lH5Fc3_xPTZuWICyamPGk
7uhsNxgSpep@JwOGwfQvZm
Dyv7FVjI3foc36RI0SWbPcEUZEKSDR1Kind
OqVOM2
6uxU5iiaVZGaoq2jFa7TVnmyEzczjaWYebW@ZlK2lIvCKyky6W2A9wXF4Y_bqw7WR
rYKR2xcYClg4gxBH
kcIdvzV1QQA0rniObuE
P6frKrl55@4dZAIhSobzZ0z6KcYamCMIZ3P1kM
@bui6EQya_xWL6_8e4@in7h_Ysgk{-truncated-}

Output
Invalid
Invalid
Invalid
Invalid
Invalid
Valid
Invalid
Invalid
Invalid
Invalid
Invalid
Invalid
Invalid
Invalid
Invalid
Valid
Valid
Invalid
Invalid
Invalid{-truncated-}

Explanation 
Refer diagram in the challenge statement.
