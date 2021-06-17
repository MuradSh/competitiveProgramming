s=" ++1";
def n(s):
    s = s.lstrip()
    neg = ""
    if len(s)==0:
        return 0
    if s[0]=="-":
        neg="-";
        s = s.replace("-","",1)
    elif not s[0].isnumeric():
        if not s[0]=="+":
            return 0
        else:
            s = s.replace("+","",1)
    num = ""
    trailingZero = 0
    for c in range(len(s)):
        if not s[c].isnumeric():
            # if c==0:
            #     return 0
            break;
        if s[c]=="0" and trailingZero==0:
            continue;
        else:
            trailingZero=1;
            num+=s[c];

    if(len(num)==0):
        return 0

    newNum = int(num)
    if(abs(newNum)>2147483647):
        if neg=="-":
            return neg+"2147483648"
        return "2147483647"
    else:
        if neg=="-":
            return newNum-newNum*2
        return newNum
print(n(s))
