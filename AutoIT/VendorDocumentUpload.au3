$vVariable = """D:\Project\IPM\SendMeritorMail\Invoices\73344-6037_Muller Redditch.pdf""""D:\Project\IPM\SendMeritorMail\Invoices\73693-6090_S.B.E..pdf"""
ControlFocus("File Upload","","Edit1")
Sleep(1000)
ControlSetText("File Upload","","Edit1",$vVariable)
Sleep(1000)
ControlClick("File Upload","","Button1")
