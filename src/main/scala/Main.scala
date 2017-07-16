object Main extends App {

  import RecipesOp._

  val i1 =  Ingredient("Peppers",2)
  val i2 =  Ingredient("Mushrooms", 1, "cup")
  val i3 =  Ingredient("Chicken", 1, "cup")
  val i4 =  Ingredient("Ground Basil", 2, "tsp")
  val i5 =  Ingredient("Salt", 0.25, "tsp")
  val i6 =  Ingredient("Tomatoes", 2, "can")

  println( i1)
  println(i5)

  val ing1 = Seq( i1, i2, i5)
  val ing2 = Seq( i3, i4, i5)
  val ing3 = Seq( i1,i3, i4, i5, i6)

  val rec1 = Recipe("rec1", ing1, "instructions1", 1)
  val rec2 = Recipe("rec2", ing2, "instructions2", 1)
  val rec3 = Recipe("rec3", ing3, "instruction3")
  val rec4 = Recipe("rec4", ing2, "instruction4")

  val myRecipes =  Seq( rec1, rec2, rec3, rec4)



  val recipes: Seq[Recipe] = Recipes.findByTitle(myRecipes, "rec1")

  for( r <- recipes) println("Recipe with title 'rec1' " + r.instruction)

  for ( r <- (Recipes.findByIngredient(myRecipes, "Chicken"))) println(Recipes.formatRecipe(r))




}