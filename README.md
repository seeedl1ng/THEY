# *Scape and Run: Parasites* – The Horrors Evolving Yet | *(Dedicated SERVER)*

[![Downloads](https://img.shields.io/github/downloads/seeedl1ng/THEY/total?logo=github&label=Downloads)](https://github.com/seeedl1ng/THEY/releases)

<details>
  <summary>🇺🇸 EN</summary>
  
*Questions, suggestions, and bug reports https://github.com/seeedl1ng/SRP5361/issues*

This branch is intended for the dedicated server side of the modpack.

## Installation
1) Install Java 25 or newer (Java 26 JRE is recommended for the best performance) [Download Java Adoptium](https://adoptium.net/temurin/releases/?os=any&arch=any&package=jre&version=26&mode=filter)
2) Download modpack from [Releases](https://github.com/seeedl1ng/THEY/releases).

>MMC - for launchers such as Prism
>
>serv - for dedicated server

3) Drag the downloaded ZIP file into your launcher window, click "Done"
4) Edit Instance → Settings → Java → Java Installation → Detect Select → Java 26 and confirm.
5) Play

<hr>

**Playing with friends is highly recommended**😋

Development of the modpack started around March 2023

</details>

<details>
  <summary>🇷🇺 RU</summary>
  
*Вопросы, предложения и сообщения об ошибках: https://github.com/seeedl1ng/SRP5361/issues*

Эта ветка для серверной части модпака (dedicated server)

# Установка на сервер

### Если у вас есть 2-й комп
1) Скачать сборку с суффиксом "serv" из [Релизов](https://github.com/seeedl1ng/THEY/releases) или сверху <> Code → Download ZIP
2) Распаковать сборку и запустить ?ИНСТАЛЛЕР?
3) Скачать [Cleanroom](https://github.com/CleanroomMC/Cleanroom/releases) (который installer.jar)
4) Запустить Cleanroom...installer.jar > Install server > Выбрать папку с сервером > OK (**! Для установки нужен zapret + [домены](https://github.com/seeedl1ng/THEY/wiki/%C2%A0Zapret) или VPN**)
5) Скачать Radmin VPN https://www.radmin-vpn.com/ru > Создайте сеть > Пригласите друзей
6) Создать start.bat и прописать в нём параметры запуска:

**Пример:**
```
chcp 65001
"C:\Program Files\Eclipse Adoptium\jre-26.0.1.8-hotspot\bin\java" -XX:+UseZGC --enable-native-access=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/sun.nio.ch=ALL-UNNAMED -Dfile.encoding=UTF-8 -Dconsole.encoding=UTF-8 -Dlog4j.configurationFile=config/log4j2.xml -Xmx5G -Xms5G -jar cleanroom-0.5.14-alpha.jar nogui 
pause
```
## Что нужно поменять:

Первые кавычки - путь до java.exe

-Xmx - максимальное значение ОЗУ

-Xms - сколько ты выделяешь ОЗУ

> /\ Оба этих значения ставьте одинаковыми

"название_ядра".jar - имя файла сервера.jar

<hr>

<details>
 <summary> О других аргументах:</summary>
  <sub>

* -XX:+UseZGC - сборщик мусора ZGC, эффективен при выделенных 4+ ГБ ОЗУ

* nogui - отключает графический интерфейс консоли (если ядро поддерживает GUI)

* pause - останавливает тики, если на сервере нет игроков

* chcp 65001, -Dfile.encoding=UTF-8, -Dconsole.encoding=UTF-8 - Нормальное отображение кирилицы

* -Dlog4j.configurationFile=config/log4j2.xml - Окрашивать строки типа ERROR, WARN из config/log4j2.xm

* --enable-native-access=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/sun.nio.ch=ALL-UNNAMED - Аргументы для Java 25-26
  </sub>
</details>

6) Запустить start.bat (чтобы выключить сервер пропиши stop в консоли)


<hr>

**Чем больше, тем лучше! Позови своего друга, и ты получишь больше удовольствия от сборки😋**

Разработка сборки ведётся с марта 2023 года.

</details>
<img width="1920" height="1057" alt="2026-06-01_21 36 09" src="https://github.com/user-attachments/assets/16deb5fa-0766-4536-b68e-5548342fc5fa" />
<img width="1920" height="1057" alt="2025-01-26_22 13 11" src="https://github.com/user-attachments/assets/33b0eaff-fa93-4810-9925-0d4e31c8570a" />
<img width="1920" height="1080" alt="2025-12-07_15 56 53" src="https://github.com/user-attachments/assets/21292af2-6b40-4a53-b781-6e4d1cc79dbf" />
<img width="1920" height="1057" alt="2025-03-26_21 53 42downscale" src="https://github.com/user-attachments/assets/9bcdfdfa-820f-4b80-9b08-a00ea2fcbfb3" />

>*They were already here. And they had built nests... ~nocubeyt*

