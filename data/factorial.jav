add,x,0,123456
add,length,0,0
add,reverse,0,0
add,place,0,1
gtq,$t0,x,place
if,$t0,label-1,label-5
print,reverse
end
label-4
mod,$t1,x,10
add,digit,0,$t1
multi,$t2,reverse,10
add,$t3,$t2,digit
add,reverse,0,$t3
div,$t4,x,10
add,x,0,$t4
jr
label-3
add,$t5,length,1
add,length,0,$t5
multi,$t6,place,10
add,place,0,$t6
jr
label-2
gtq,$t7,x,place
if,$t7,label-3
jr
label-1
add,i,0,1
looplabel0
ltq,$l0,i,x
lif,$l0,label-2,leaveloop0
add,i,i,1
jump,looplabel0
leaveloop0
add,i,0,1
looplabel1
ltq,$l1,i,length
lif,$l1,label-4,leaveloop1
add,i,i,1
jump,looplabel1
leaveloop1
jr
label-5
add,reverse,0,-1
jr

