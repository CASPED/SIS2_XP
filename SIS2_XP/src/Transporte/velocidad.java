/**
 *
 * @author
 */
public class velocidad {
private int maximo=120;    
public boolean Verificar(int velocidad)
{
  if(velocidad>=0 && velocidad<=maximo)
  return true;    
  else
  return false;    
}

private void setMaximo(int max){
maximo=max;
}
}
