# Hoja de vida
## Datos personales
* **Nombre:** *Juan Camilo Rojas Ortiz*
* **Edad:** 19 a�os
* **Ciudad:** Bogot�
* **Universidad:** *Escuela Colombiana de Ingenier�a*
* **Carrera:** Ingenier�a de Sistemas
* **Semestre:** 7
## Plan de estudios
el plan de estudios se puede encontrar en  [plan de estudios sistemas](https://www.escuelaing.edu.co/escuela/planesEstudio/img/sistemas/Malla-curricular-SISTEMAS.pdf) 
Las materias que estoy cursando este semestre son:  
1.CVDS  
2.RECO  
3.AUPN  
4.FCFI\
## Imagen Random:
![](https://i.ytimg.com/vi/-M_j9rMGejI/maxresdefault.jpg)

## Algoritmo de Dijkstra
El algoritmo de Dijkstra, tambi�n llamado algoritmo de caminos m�nimos, es un algoritmo para la determinaci�n del camino m�s corto, dado un v�rtice origen, hacia el resto de los v�rtices en un grafo que tiene pesos en cada arista. Su nombre alude a Edsger Dijkstra, cient�fico de la computaci�n de los Pa�ses Bajos que lo describi� por primera vez en 1959.

La idea subyacente en este algoritmo consiste en ir explorando todos los caminos m�s cortos que parten del v�rtice origen y que llevan a todos los dem�s v�rtices; cuando se obtiene el camino m�s corto desde el v�rtice origen hasta el resto de los v�rtices que componen el grafo, el algoritmo se detiene.
~~~
 DIJKSTRA (Grafo G, nodo_fuente s)       
       para u ? V[G] hacer
           distancia[u] = INFINITO
           padre[u] = NULL
           visto[u] = false
       distancia[s] = 0
       adicionar (cola, (s, distancia[s]))
       mientras que cola no es vac�a hacer
           u = extraer_m�nimo(cola)
           visto[u] = true
           para todos v ? adyacencia[u] hacer
               si � visto[u]      
                   si distancia[v] > distancia[u] + peso (u, v) hacer
                       distancia[v] = distancia[u] + peso (u, v)
                       padre[v] = u
                       adicionar(cola,(v, distancia[v]))
~~~
se puede encontrar mas infromacion de este algoritmo en <https://es.wikipedia.org/wiki/Algoritmo_de_Dijkstra>