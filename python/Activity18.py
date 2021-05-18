import pandas as pd

df = pd.read_csv("userdetails.csv")

print(df)
print(df["Usernames"])
print(df["Usernames"][2],df["Passwords"][2])

print(df.sort_values("Usernames",ascending=True))

print(df.sort_values("Passwords",ascending=False))



