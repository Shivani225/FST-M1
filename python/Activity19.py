import pandas as pd

personaldetails = {
    "FirstName" : ["Satvik","Avinash","Lahri"],
    "LastName" : ["Shah","Kati","Rath"],
    "Email" : ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber" : ["4537829158","5892184058","4528727830"]
}

df = pd.DataFrame(personaldetails)
print(df)

df.to_excel("personaldetails.xlsx",sheet_name="Sheet1",index = False)