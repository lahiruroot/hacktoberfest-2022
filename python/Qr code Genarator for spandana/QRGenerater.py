



from secrets import choice
import qrcode


def QrCodeGenerator():

    
    name = input("Name: ")
    no = int(input("Ticket Number: "))
    pay = True
    data = "Name: " + name + "\n" + "Ticket Number: " + str(no) + "\n" + "Payment : Yes"
        
    if (pay == True):
    
                

                qr = qrcode.QRCode(version=1,
                            box_size=10,
                            border=5)

                qr.add_data(data)

                qr.make(fit=True)
                img = qr.make_image(fill_color='black',
                                    back_color='white')

                imagename = name + str(no)

                img.save('%s.png' % imagename)

                print("QR code Generated!\n\n")
                
    

    else:
        print("Did not paid for the ticket")
            


i=0
#user = input("Do you want to generate QR code? (Y/N):")

for i in range(1000): 
    user = input("Do you want to generate QR code? (Y/N): ")
    if user == "Y" or user == "y":

        QrCodeGenerator()

    else:
        print("Thank you for using our service")
        exit()






