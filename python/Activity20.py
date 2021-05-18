import pandas as pd

df = pd.read_excel("personaldetails.xlsx",sheet_name="Sheet1")
print(df)

print(df.shape)
print(df["Email"])
print(df.sort_values("FirstName"))
