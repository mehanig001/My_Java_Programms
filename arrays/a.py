import math
y=var('y')
f=y/exp(x)
Int=integral(integral(f,(y,0,x^2)),(x,0,1))
show(Int)
# or you can do the integrals one at a time
InnerInt=integral(f,(y,0,x^2))
show(InnerInt)
Int=integral(InnerInt,(x,0,1))
show(Int)
# or you can do just the indefinite integral to check
# your antiderivative
AntiDeriv=integral(f,y)
show(AntiDeriv)