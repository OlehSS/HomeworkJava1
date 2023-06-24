#!/bin/bash

 echo "You name is: $(whoami)"
 echo "You working directory is: $(pwd)"
 echo "done"

// Дальнейших строк не было в коде:
 Проверка работоспособности:
  chmod 744 testscript.sh
  ./testsctipt.sh
 Убрать права на чтение:
  chmod 344 testscript.sh
 Убрать права на исполнение:
  chmod 244 testscript.sh
 Сделать файл скрытым:
  mv /root/testscript.sh /root/.testscript.sh
