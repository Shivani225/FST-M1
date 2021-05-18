import pandas as pd

userdetails = {
    "Usernames" : ["admin","Charles","Deku"],
    "Passwords" : ["password","Charl13","AllMight"],
}

df = pd.DataFrame(userdetails)

print(df)

df.to_csv("userdetails.csv",index=False)



