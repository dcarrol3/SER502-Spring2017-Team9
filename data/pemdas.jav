multi,$t0,-2,-2
sub,$t1,8,$t0
sub,$t2,15,3
multi,$t3,4,2
add,$t4,$t2,$t3
add,$t5,$t1,$t4
multi,$t6,5,$t5
add,$t7,22,$t6
add,a,0,$t7
print,a
multi,$t8,-2,-2
multi,$t9,$t8,2
add,$t10,3,$t9
add,$t11,5,3
sub,$t12,$t10,$t11
multi,$t13,8,$t12
add,$t14,3,$t13
add,b,0,$t14
print,b
multi,$t15,3,3
multi,$t16,$t15,3
multi,$t17,2,2
sub,$t18,$t16,$t17
multi,$t19,3,$t18
add,$t20,9,$t19
multi,$t21,-2,$t20
add,c,0,$t21
print,c
add,$t22,3,2
multi,$t23,-4,4
sub,$t24,$t22,$t23
multi,$t25,1,$t24
add,$t26,6,$t25
multi,$t27,9,$t26
sub,$t28,18,$t27
add,d,0,$t28
print,d
add,count,0,0
gt,$t29,a,b
if,$t29,label-1
add,$t30,count,1
add,count,0,$t30
lt,$t31,a,b
if,$t31,label-2
add,$t32,count,1
add,count,0,$t32
ltq,$t33,a,b
if,$t33,label-3
add,$t34,count,1
add,count,0,$t34
gtq,$t35,a,b
if,$t35,label-4
add,$t36,count,1
add,count,0,$t36
eq,$t37,a,b
if,$t37,label-5
add,$t38,count,1
add,count,0,$t38
neq,$t39,a,b
if,$t39,label-6
add,$t40,count,1
add,count,0,$t40
neq,$t41,a,b
eq,$t42,a,b
or,$t43,$t41,$t42
if,$t43,label-7
add,$t44,count,1
add,count,0,$t44
neq,$t45,a,b
gt,$t46,a,b
and,$t47,$t45,$t46
if,$t47,label-8
end
label-4
print,count
jr
label-3
print,count
jr
label-2
print,count
jr
label-1
print,count
jr
label-8
print,count
jr
label-7
print,count
jr
label-6
print,count
jr
label-5
print,count
jr
