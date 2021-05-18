class car:
    def __init__(self,manufacture,model,make,transmission,color):
        self.manufacture = manufacture
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(("{} {} is moving").format(self.manufacture,self.model))

    def stop(self):
        print(("{} {} has stopped").format(self.manufacture,self.model))

c1 = car("Tata","Altroz","2020","Automatic","Midtown Grey")
c2 = car("Mercedes-Benz","GLA","2021","Automatic","Black")
c3 = car("BMW","X1","2021","Automatic","White")

c1.accelerate()
c1.stop()

c2.accelerate()
c2.stop()

c3.accelerate()
c3.stop()


