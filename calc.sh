r=0;
for a in $(cat ./numbers)
  do
    r=$(bc <<<$a'+'$r)
   done
