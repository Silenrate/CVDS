### Hoja de vida

## datos basicos

* **nombre**: _Juan Camilo Angel Hernandez_
* **edad** : 19 años
* **ciudad** : Zipaquira

## intereses
mis intereses son:

* escuchar musica como <https://youtu.be/_tcW-j7KFgY>
* programar
* ver cine

## plan de estudios
actualmente mi plan de estudios es:

1. CVDS
2. AUPN
3. FCFI
4. RECO

~~~
#Codigo regresion lineal

import numpy as np
import matplotlib.pyplot as plt

from sklearn.datasets import load_boston

#cargamos la libreria

boston = load_boston()
#print(boston.DESCR) #descripcion de ese dataset


X = np.array(boston.data[:,5]) #num_habitaciones

Y = np.array(boston.target) #valor medio

plt.scatter(X,Y,alpha=0.3)

#añadimos columna de unos (terminos independientes)

X = np.array([np.ones(506),X]).T

B = np.linalg.inv(X.T @ X) @ X.T @ Y #matriz de parametros que minimizan el ECM de la nube de puntos

plt.plot([4,9],[B[0]+B[1]*4,B[0]+B[1]*9], c="red")
plt.show()
~~~
![](https://www.researchgate.net/profile/Enrique_Rico-Garcia/publication/262762874/figure/fig2/AS:669959541755915@1536742210539/Figura-3-Regresion-lineal-entre-fotosintesis-medida-y-simulada-con-la-ANN-para-todo-el.png)

El modelo de pronóstico de regresión lineal permite hallar el valor esperado de una variable aleatoria a cuando b toma un valor específico.

 La aplicación de este método implica un supuesto de linealidad cuando la demanda presenta un comportamiento creciente o decreciente, por tal razón, se hace indispensable que previo a la selección de este método exista un análisis de regresión que determine la intensidad de las relaciones entre las variables que componen el modelo.

![](https://lh3.googleusercontent.com/2b9TNAgLhDXAppFVHXC1gPPCxKnF08AzE0cLlbuowNiTAJ8TGoYIosAsq2dQy1kroYe8N3m3IWbrSmzZ9DSakJx-BwCNnCtpsBe9nIX385tiySedPnxeT0YUPzg4eum6NuXM99IIgAGsMkuD9N0-nx2mOSQLDSqlKlBcf86SBLPYNo-RUMmpiXsdpokX9gG_UchYu-cYUOdAYq2YbRln5MeCsEyyArgcyCgZ2vLZnnFdxqrac8J9qTH14-9DcUp0sunlghNFBHwGjQWjcXxtqi-I4fG4rdtMeTG5HKjAnY2YTY7ceboe0BSz6jLMumPoBEdJ2I1zUS7RUnlDbewZKA6YbhlVuAcX6aitDjZPdO0s3VFdhUAxVVjG94fV_uUNLBheeuU6-FRQVaFy64m2KNpcnm9LVYwShIsbfcAActeR2cOrLAdZ0062MC5Eaj5Lcm6dAndyC3NmcPOLvtVWP7hjZLHQzqb-tMxGblSJLxCqcYSYd3mZ7LO9pngvtMkOyWqM9TvLSh7HJsudnQ_pEVgkXKu4G1JEikAVsFrxATycv4aVW_rndLxNc9QzYVtoNo8O9xcAwGYybbROez2zSv9CwBig6QHiW-Vb8IFUv49v8UtVOQHpvdYCL3k-ZmPgvx-CAv8NLMz4GWXksqoGnKJkmz-Xwtw=w818-h610-no)
