import qrcode

name = input("Name: ")
no = int(input("Ticket Number: "))
pay = True

if (pay == True):

    data = "Name: " + name + "\n" + "Ticket Number: " + str(no) + "\n" + "Payment : Yes"

    qr = qrcode.QRCode(version=1,
                       box_size=10,
                       border=5)


    qr.add_data(data)

    qr.make(fit=True)
    img = qr.make_image(fill_color='black',
                        back_color='white')

    imagename = name + " " + str(no)

    img.save('Qr/%s.png' % imagename)
    
    print("QR code Generated!")
    x= input("Press any key to exit")


else:
    print("Did not paid for the ticket")




