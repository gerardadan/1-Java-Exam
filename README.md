# **Gestión de Coches del Concesionario**

## **Contexto**

Un concesionario de automóviles desea desarrollar un sistema para gestionar los vehículos que comercializa. Actualmente, venden tres tipos principales de coches: **Sedán, SUV y Deportivo**, cada uno con características y finalidades distintas.

## 👀 **Objetivo**

Implementar un programa en **Java** que permita **registrar vehículos** y **consultar sus detalles**.

**No es necesario utilizar una base de datos ni una interfaz en consola.**

El correcto funcionamiento del sistema puede demostrarse en el método `main()` o mediante **pruebas unitarias**.

---

## **Requisitos del Sistema**

### 📌 1 - **Registro de coches**

El sistema debe permitir registrar diferentes tipos de coches con los siguientes atributos generales:

- **Marca** (por ejemplo, Toyota, BMW, Ford).
- **Modelo** del coche.
- **Tipo de combustible**: gasolina, diésel o eléctrico.
- **Año de fabricación**.

**Cada tipo de coche debe tener atributos adicionales específicos que lo caractericen:**

| **Tipo de Coche** | **Atributos Específicos** |
| --- | --- |
| **Sedán** | Capacidad del maletero (litros). |
| **SUV** | Tipo de tracción (4x2, 4x4). |
| **Deportivo** | Velocidad máxima (km/h). |

---

### 📌 2 - Descripción del coche

Cada tipo de coche debe implementar su propia descripción o propósito principal de uso.

Debe definirse un **método que genere una descripción atractiva y personalizada**, utilizando los atributos del coche para resaltar sus puntos fuertes. Por ejemplo:

- 🚗 **Sedán**
    
    “Con su espacioso maletero de `X` litros y un diseño pensado para el confort, el `marca modelo` es el compañero ideal para viajes familiares y trayectos diarios con estilo.”
    
- 🚙 **SUV**
    
    “El `marca modelo`, con tracción `4x2`/`4x4`, es un SUV que no teme salir del asfalto. Perfecto para aventuras al aire libre, terrenos difíciles y escapadas de fin de semana con potencia y seguridad.”
    
- 🏎️ **Deportivo**
    
    “Diseñado para quienes viven la carretera intensamente: el `marca modelo` alcanza una velocidad máxima de `X km/h`, combinando elegancia y rendimiento en cada curva.”
    

> 💡 Las descripciones deben generarse dinámicamente a partir de los atributos del objeto: marca, modelo, año, tipo de combustible y el atributo específico del tipo de coche.
> 

---

### 📌 3 - Consultas y reportes

El sistema debe permitir realizar las siguientes consultas:

1. **Mostrar una lista completa de todos los coches registrados**, mostrando su información relevante.
2. **Filtrar los coches fabricados después de un año específico**, proporcionado como parámetro.

---

### 📌 4 - Vehículos exportables

Algunos vehículos (no solamente algunos coches) están disponibles para la venta internacional y requieren un proceso de exportación especial. Los coches **deportivos** de este concesionario son unos de ellos.

Para generar el documento de la exportación usaremos una clase como:

```java
public class ExportReportPrinter {
    public void printReport(Exportable exportable) {
        System.out.println("Documento de exportación generado:");
        System.out.println(exportable.getExportInfo());
    }
}
```

Haz que nuestros coches deportivos sean compatibles para ser exportados.

💡 Recuerda que otros vehículos como motocicletas y camiones probablemente también deberán ser compatibles con la exportación.
