# The Horrors Evolving Yet | *(Dedicated SERVER)*

[![Downloads](https://img.shields.io/github/downloads/seeedl1ng/THEY/total?logo=github&label=Downloads)](https://github.com/seeedl1ng/THEY/releases)

<details>
  <summary>🇺🇸 EN</summary>

This page is for the dedicated server version of the modpack.

# Server Installation

### If you have a second PC
1. Download the build with the **"serv"** suffix from the [Releases](https://github.com/seeedl1ng/THEY/releases), or Beta version using PowerShell:
```

```
2. For the release version, extract the archive and run the ?INSTALLER?
3. Download [Cleanroom](https://github.com/CleanroomMC/Cleanroom/releases) (which `installer.jar`)
4. Run **Cleanroom Installer** → **Install Server** → select your server folder → **OK**
5. Download **Radmin VPN**: https://www.radmin-vpn.com → Create Network → Invite your friends
6. Replace four values in `start.ps1`:

 * `$Java = "..."` — path to your `java.exe`

* `-Xmx` — maximum heap size

* `-Xms` — initial heap size

> ⚠️ Keep `-Xms` and `-Xmx` set to the same value

* `cleanroom-[version]-alpha.jar` — the name of the Cleanroom server JAR

---

<details>
 <summary>More information about the JVM arguments</summary>
  <sub>

 

* `-XX:+UseZGC` — Enables the Z Garbage Collector. Recommended for servers with 4 GB or more of allocated memory

 

* `-XX:+UseLargePages` — Enables [Large Pages](https://docs.oracle.com/en/java/javase/26/docs/specs/man/java.html#large-pages) support (Disabled by default on Windows)

 

* `-XX:+UseCompactObjectHeaders` — Reduces object header size (In a future release it is expected to be enabled by default)

 

* `-XX:+PerfDisableSharedMem` — Disables the legacy JVM `hsperfdata` interface, used by older diagnostic tools (VisualVM/jstat). Use JFR or Flare instead

 

* `--enable-native-access=ALL-UNNAMED` `--add-opens=java.base/java.lang=ALL-UNNAMED` `--add-opens=java.base/sun.nio.ch=ALL-UNNAMED` - Required for compatibility with Java 25–26.

 

* `-Dlog4j.configurationFile=config/log4j2.xml` — Uses a custom Log4j2 configuration (colored and formatted console output, from config/log4j2.xml)

 

* `nogui` — Disables the graphical server console (if the server supports a GUI)

 

* `Pause` — "Press Enter to continue..." after the server stops

   </sub>
</details>

---

7. Run `start.ps1`

> To stop the server, type `stop` in the server console

 

</details>

<details>
  <summary>🇷🇺 RU</summary>

Эта страница предназначена для серверной версии модпака (dedicated server)

# Установка на сервер

### Если у вас есть 2-й комп

1. Скачать сборку с суффиксом **"serv"** из [Релизов](https://github.com/seeedl1ng/THEY/releases) или Бета версию через Powershell:
```

```
2. Для Релиз версии распаковать сборку и запустить ?ИНСТАЛЛЕР?
3. Скачать [Cleanroom](https://github.com/CleanroomMC/Cleanroom/releases) (который `installer.jar`)
4. Запустить **Cleanroom Installer** → **Install Server** → выбрать папку сервера → **OK** (**! Для установки нужен zapret + [домены](https://github.com/seeedl1ng/THEY/wiki/%C2%A0Zapret) или VPN**)
5. Скачать **Radmin VPN**: https://www.radmin-vpn.com/ru > Создайте сеть > Пригласите друзей
6. Заменить 4 параметра в `start.ps1`:

* `$Java = "..."` - путь до вашей `java.exe`

* `-Xmx` - максимальное значение ОЗУ

* `-Xms` - начальный размер ОЗУ

> ⚠️ Оставьте `-Xms` и `-Xmx` одинаковыми

* `cleanroom-[версия]-alpha.jar` - имя ядра Cleanroom.jar

---

<details>
 <summary>Подробнее о других аргументах:</summary>
  <sub>

 

* `-XX:+UseZGC` - сборщик мусора ZGC, эффективен при выделенных 4+ ГБ ОЗУ

 

* `-XX:+UseLargePages` - Поддержка [Больших Страниц](https://docs.oracle.com/en/java/javase/26/docs/specs/man/java.html#large-pages) (По умолчанию отключено в Windows)

 

* `-XX:+UseCompactObjectHeaders` - Уменьшает размер заголовков объектов в памяти (В будущих версиях ожидается, что она будет включена по умолчанию)

 

* `-XX:+PerfDisableSharedMem` - Отключает старый `hsperfdata` интерфейс JVM, используемый старыми диагностическими инструментами (VisualVM/jstat). Лучше используйте JFR или Flare

 

* `--enable-native-access=ALL-UNNAMED` `--add-opens=java.base/java.lang=ALL-UNNAMED` `--add-opens=java.base/sun.nio.ch=ALL-UNNAMED` - Требуется для совместимости с Java 25-26

 

* `-Dlog4j.configurationFile=config/log4j2.xml` - использует пользовательскую конфигурацию Log4j2 (цветной вывод и форматирование логов, из config/log4j2.xml)

 

* `nogui` - отключает графический интерфейс консоли (если ядро поддерживает GUI)

 

* `Pause` - После остановки сервера "Press Enter to continue..."

  </sub>
</details>

---

7. Запустить `start.ps1`
> Чтобы выключить сервер, введите `stop` в консоли

 

</details>

<img width="1920" height="1057" alt="2026-06-01_21 36 09" src="https://github.com/user-attachments/assets/16deb5fa-0766-4536-b68e-5548342fc5fa" />
<img width="1920" height="1057" alt="2025-03-26_21 53 42downscale" src="https://github.com/user-attachments/assets/9bcdfdfa-820f-4b80-9b08-a00ea2fcbfb3" />
