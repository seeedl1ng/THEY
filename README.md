# *Scape and Run: Parasites* The Horrors Evolving Yet
[![TotalDownloads](https://img.shields.io/github/downloads/seeedl1ng/SRP5361/total?label=Загрузок)](https://github.com/seeedl1ng/SRP5361/releases "Download")

◆RU ◇<a href="https://github.com/seeedl1ng/SRP5361/blob/main/README_EN.md">EN<a/>

*!!!Не стесняйтесь задавать вопросы, и сообщать о багах https://github.com/seeedl1ng/SRP5361/issues* пж

Сборка для Minecraft 1.12.2, с упором на реалистичность и выживание.
В основе лежит мод Scape and Run: Parasites (SRP)

**Есть какие-то вопросы? У нас есть [Вики](https://github.com/seeedl1ng/SRP5361/wiki/FAQ)!**

<img width="1920" height="1057" alt="2025-01-26_22 13 11" src="https://github.com/user-attachments/assets/33b0eaff-fa93-4810-9925-0d4e31c8570a" />
<img width="1920" height="1080" alt="2025-12-07_15 56 53" src="https://github.com/user-attachments/assets/21292af2-6b40-4a53-b781-6e4d1cc79dbf" />
<img width="1920" height="1080" alt="2025-03-23_00 08 45" src="https://github.com/user-attachments/assets/04dff66a-f49b-4391-a583-9f90c0ee99a6" />
<img width="1920" height="1057" alt="2025-03-26_21 53 42downscale" src="https://github.com/user-attachments/assets/9bcdfdfa-820f-4b80-9b08-a00ea2fcbfb3" />

>*Они уже были здесь. И они свили гнезда... ~nocubeyt*

## Установка
1) Необходима java 25, но для большей производительности используйте java 26 JRE,  ([Скачать Java Adoptium](https://adoptium.net/temurin/releases/?os=any&arch=any&package=jre&version=26&mode=filter))
2) [Скачать](https://github.com/seeedl1ng/THEY/releases) сборку

>MMC - для лаунчеров типа Prism, serv - для сервера

4) Перекинуть скаченный .zip в окно лаунчера, нажать "Готово"
5) Играть

## Установка на сервер
Лагает игра? или у вас слабый проц? - разгрузите серверную часть сборки на сервер

### Если у вас нету ничего (особенно если вы из US)
1) Скачайте сборку с суффиксом "serv" из [релизов](https://github.com/seeedl1ng/THEY/releases)

### Если у вас есть 2-й комп
1) Скачайте сборку с суффиксом "serv" из [релизов](https://github.com/seeedl1ng/THEY/releases)
2) Создать start.bat и прописать в нём параметры запуска:

**Пример:**
```
"C:\Program Files\Eclipse Adoptium\jre-26.0.0.35-hotspot\bin\java" -Xmx5G -Xms5G -jar cleanroom-0.5.8-alpha.jar nogui 
pause
```
Первые ковычки - путь до java.exe

-Xmx - максимальное значение ОЗУ

-Xms - сколько ты выделяешь ОЗУ

> /\ Оба этих значения ставте одинаковыми

"название_ядра".jar - имя файла сервера.jar

nogui - отключает графический интерфейс консоли (если ядро поддерживает GUI)

pause - останавливает тики, если на сервере нет игроков


**Чем больше, тем лучше! Позови своего друга, и ты получишь больше удовольствия от сборки😋**

Сборку начал делать c +- 2023.03
