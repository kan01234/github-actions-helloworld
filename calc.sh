r=0;
for a in $(cat ./numbers)
  do
    r=$(expr $a+$r)
   done
echo $r
