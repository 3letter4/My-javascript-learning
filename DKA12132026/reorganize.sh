#!/bin/bash

# Reorganization script for DKA12132026 Java project
# This script organizes and renames Java files following best practices

set -e  # Exit on error

echo "Starting reorganization..."

# ============================================
# STEP 1: Copy unique, well-structured files to new src/ directory
# ============================================

# --- BASICS (Welcome, Implicit/Explicit casting, simple arrays) ---
cp basics/Welcome.java src/basics/Welcome.java
cp basics/Implicit.java src/basics/TypeCastingImplicit.java
cp basics/Explicit.java src/basics/TypeCastingExplicit.java
cp basics/arraybulan.java src/basics/ArrayBulan.java

# --- ARRAYS (All array-related files) ---
cp basics/array2.java src/arrays/ArrayInput.java
cp basics/arraybulan.java src/arrays/ArrayHariBulan.java
cp array/TwoDimensionArray.java src/arrays/TwoDimensionArray.java
cp array/TwoDimensionInput.java src/arrays/TwoDimensionInput.java
cp array/latihan/CPGA.java src/arrays/CgpaArray.java
cp latihan/cpa.java src/arrays/NamaPelajarArray.java
cp latihan/hari.java src/arrays/HariArray.java
cp latihan/purata.java src/arrays/PurataArray.java
cp latihan/NamaPertama.java src/arrays/NamaPertamaArray.java
cp latihan/PendapatanKeluarga.java src/arrays/PendapatanKeluargaArray.java
cp latihan/alattulis.java src/arrays/AlatTulisArray.java
cp latihan/makanan.java src/arrays/HargaMakananArray.java
cp latihan/arraygenap.java src/arrays/ArrayGenapGanjil.java
cp latihan/arraygenap2.java src/arrays/ArrayGenapGanjilSeparated.java
cp DKA12132026/array3.java src/arrays/StringArrayInput.java

# --- CONDITIONALS (if-else, switch statements) ---
cp conditionals/GenapGanjil.java src/conditionals/GenapGanjil.java
cp conditionals/gred.java src/conditionals/LulusGagal.java
cp conditionals/level.java src/conditionals/LevelKemahiran.java
cp conditionals/switcher.java src/conditionals/SwitchNombor.java
cp conditionals/tahunlompat.java src/conditionals/TahunLompat.java
cp conditionals/tempahan.java src/conditionals/TempahanHotel.java
cp conditionals/umur.java src/conditionals/UmurSelection.java
cp conditionals/umurSelection.java src/conditionals/KategoriUmur.java
cp conditionals/markahgred.java src/conditionals/MarkahGred.java
cp loops/dermadarah.java src/conditionals/DermaDarahKelayakan.java
cp loops/tudung.java src/conditionals/KiraTudung.java
cp loops/bulan.java src/conditionals/BulanSwitch.java
cp loops/hari.java src/conditionals/HariSwitch.java

# --- LOOPS (for, while, do-while) ---
cp loops/loop.java src/loops/LoopContoh.java
cp loops/dowhile.java src/loops/DoWhileContoh.java
cp loops/selagi.java src/loops/WhileContoh.java
cp loops/fornest.java src/loops/ForNested.java
cp loops/segitiga.java src/loops/SegitigaLuas.java
cp looptrain/menurun.java src/loops/NomborMenurun.java
cp looptrain/purata.java src/loops/PurataInput.java
cp looptrain/kuasadua.java src/loops/KuasaDuaLoop.java
cp looptrain/to100.java src/loops/JumlahTo100.java
cp looptrain/plus2.java src/loops/NomborPlus2.java
cp looptrain/markahsistem.java src/loops/SistemMarkah.java
cp DKA12132026/katahikmat.java src/loops/KataHikmat.java

# --- METHODS (Functions with parameters and return values) ---
cp DKA12132026/KuasaDua.java src/methods/KuasaDuaMethod.java
cp DKA12132026/PengiraanSegiEmpat.java src/methods/PengiraanSegiEmpat.java
cp DKA12132026/panggil.java src/methods/JumlahMethod.java
cp DKA12132026/bujur.java src/methods/LukisBujur.java
cp DKA12132026/luas.java src/methods/KiraLuasBulatan.java
cp DKA12132026/test.java src/methods/PrintMessage.java
cp DKA12132026/test2.java src/methods/AreaCircleNoParam.java
cp DKA12132026/test3.java src/methods/AreaCircleVoid.java
cp DKA12132026/test4.java src/methods/AreaCircleWithReturn.java

# --- OOP (Object-Oriented Programming) ---
cp oop/AqilsBurgers.java src/oop/AqilsBurgers.java
cp oop/NiceDays.java src/oop/NiceDays.java
cp oop/Pelajar.java src/oop/PelajarInfo.java

# ============================================
# STEP 2: Fix naming convention issues in copied files
# ============================================

# Fix class names to match file names (PascalCase)
sed -i 's/public class array2/public class ArrayInput/' src/arrays/ArrayInput.java
sed -i 's/public class cpa/public class NamaPelajarArray/' src/arrays/NamaPelajarArray.java
sed -i 's/public class hari/public class HariArray/' src/arrays/HariArray.java
sed -i 's/public class purata/public class PurataArray/' src/arrays/PurataArray.java
sed -i 's/public class arraygenap/public class ArrayGenapGanjil/' src/arrays/ArrayGenapGanjil.java
sed -i 's/public class arraygenap2/public class ArrayGenapGanjilSeparated/' src/arrays/ArrayGenapGanjilSeparated.java
sed -i 's/public class alat tulis/public class AlatTulisArray/' src/arrays/AlatTulisArray.java
sed -i 's/public class makanan/public class HargaMakananArray/' src/arrays/HargaMakananArray.java
sed -i 's/public class array3/public class StringArrayInput/' src/arrays/StringArrayInput.java

sed -i 's/public class gred/public class LulusGagal/' src/conditionals/LulusGagal.java
sed -i 's/public class level/public class LevelKemahiran/' src/conditionals/LevelKemahiran.java
sed -i 's/public class switcher/public class SwitchNombor/' src/conditionals/SwitchNombor.java
sed -i 's/public class tahunlompat/public class TahunLompat/' src/conditionals/TahunLompat.java
sed -i 's/public class tempahan/public class TempahanHotel/' src/conditionals/TempahanHotel.java
sed -i 's/public class umurSelection/public class KategoriUmur/' src/conditionals/KategoriUmur.java
sed -i 's/public class markahgred/public class MarkahGred/' src/conditionals/MarkahGred.java
sed -i 's/public class dermadarah/public class DermaDarahKelayakan/' src/conditionals/DermaDarahKelayakan.java
sed -i 's/public class tudung/public class KiraTudung/' src/conditionals/KiraTudung.java

sed -i 's/public class selagi/public class WhileContoh/' src/loops/WhileContoh.java
sed -i 's/public class fornest/public class ForNested/' src/loops/ForNested.java
sed -i 's/public class segitiga/public class SegitigaLuas/' src/loops/SegitigaLuas.java
sed -i 's/public class menurun/public class NomborMenurun/' src/loops/NomborMenurun.java
sed -i 's/public class plus2/public class NomborPlus2/' src/loops/NomborPlus2.java
sed -i 's/public class markahsistem/public class SistemMarkah/' src/loops/SistemMarkah.java
sed -i 's/public class katahikmat/public class KataHikmat/' src/loops/KataHikmat.java

sed -i 's/public class panggil/public class JumlahMethod/' src/methods/JumlahMethod.java
sed -i 's/public class bujur/public class LukisBujur/' src/methods/LukisBujur.java
sed -i 's/public class luas/public class KiraLuasBulatan/' src/methods/KiraLuasBulatan.java

sed -i 's/public class Pelajar/public class PelajarInfo/' src/oop/PelajarInfo.java

# Remove package declarations for simpler structure
find src/ -name "*.java" -exec sed -i '/^package /d' {} \;

echo "Reorganization complete!"
echo ""
echo "New structure:"
find src/ -type f -name "*.java" | sort
